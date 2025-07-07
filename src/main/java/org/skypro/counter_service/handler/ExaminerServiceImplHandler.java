package org.skypro.counter_service.handler;

import org.skypro.counter_service.exeption.QuestionIllegalArgumentException;
import org.skypro.counter_service.exeption.QuestionNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.skypro.counter_service.handler.ExaminerServiceImplHandler;

import java.util.UUID;


@RestControllerAdvice
public class ExaminerServiceImplHandler {

    public ExaminerServiceImplHandler(int examinerServiceImplHandler) {
    }

    @ExceptionHandler(QuestionIllegalArgumentException.class)
    public String getQuestionsWhenAmountMoreWhenSetQuestionSizeException() {
        return "Количество запрашиваемых вопросов превышает количества вопросов в хранилище";
    }

    @ExceptionHandler(QuestionIllegalArgumentException.class)
    public ResponseEntity<String> handleException(Exception e) {
        String errorUUID = logErrorToNoSql(e);
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Количество запрашиваемых вопросов превышает количества вопросов в хранилище " + errorUUID);
    }

    private String logErrorToNoSql(Exception e) {
        return UUID.randomUUID().toString();
    }

    public int getPower() {
        return 0;
    }

    @ExceptionHandler(QuestionNotFoundException.class)
    public String removeWhenQuestionNotFoundException() {
        return "Вопрос не был найден";
    }

        @RestControllerAdvice
        static class JavaQuestionServiceHandler{

            public JavaQuestionServiceHandler(String service, ExaminerServiceImplHandler examinerServiceImplHandler) {
            }

            @ExceptionHandler(QuestionNotFoundException.class)
            public String removeWhenQuestionNotFoundException() {
                return "Вопрос не был найден";
            }

            public String getModel() {
                return "";
            }
        }
    }
