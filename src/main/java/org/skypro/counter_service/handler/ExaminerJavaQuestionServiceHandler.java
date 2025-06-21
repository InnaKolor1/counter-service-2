package org.skypro.counter_service.handler;
import org.skypro.counter_service.handler.ExaminerServiceImplHandler;
import org.skypro.counter_service.handler.JavaQuestionServiceHandler;

public class ExaminerJavaQuestionServiceHandler {
    private ExaminerServiceImplHandler examinerServiceImplHandler;
    private JavaQuestionServiceHandler javaQuestionServiceHandler;

    public ExaminerJavaQuestionServiceHandler(String javaQuestionServiceHandlerModel, int examinerServiceImplHandlerPower) {
        this.examinerServiceImplHandler = new ExaminerServiceImplHandler(examinerServiceImplHandlerPower);
        this.javaQuestionServiceHandler = new JavaQuestionServiceHandler(javaQuestionServiceHandlerModel, this.examinerServiceImplHandler);
    }

    public String getjavaQuestionServiceHandler() {
        return javaQuestionServiceHandler.getModel();
    }

    public int getexaminerServiceImplHandlerPower() {
        return examinerServiceImplHandler.getPower();
    }
}

