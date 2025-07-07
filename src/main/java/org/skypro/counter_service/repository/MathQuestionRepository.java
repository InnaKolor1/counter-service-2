package org.skypro.counter_service.repository;


import org.skypro.counter_service.model.Question;
import org.springframework.stereotype.Repository;
import org.skypro.counter_service.repository.QuestionRepository;
import org.skypro.counter_service.repository.MathQuestionRepository;
import org.skypro.counter_service.model.Question;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


@Repository
public class MathQuestionRepository implements QuestionRepository {

    private Set<Question> mathQuestions = new HashSet<>();

    public static Object greet(String name) {
        return null;
    }
    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        mathQuestions.add(newQuestion);
        return newQuestion;
    }

    @Override
    public Question remove(Question question) {
        mathQuestions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(mathQuestions);
    }

    @Override
    public Question getRandomQuestion() {
        return null;

    }
}