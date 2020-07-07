package com.neo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebResult;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

@ControllerAdvice
public class GlobalExceptionHandler {

    //https://jira.spring.io/browse/SPR-14651
    //4.3.5 supports RedirectAttributes redirectAttributes
    @ExceptionHandler(MultipartException.class)
    public String handleMultipartException(MultipartException e, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", e.getCause().getMessage());
        return "redirect:/uploadStatus";
    }

    @ExceptionHandler(IOException.class)
    public String handleIOException(IOException e, RedirectAttributes redirectAttributes) {
        e.printStackTrace();
        redirectAttributes.addFlashAttribute("message", e.getClass().getName() + ":" + e.getMessage());
        return "redirect:/uploadStatus";
    }
}
