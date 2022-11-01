package prosky.skyprocoursework3.impl;

import prosky.skyprocoursework3.model.Question;

import java.util.Collection;

public interface QuestionService {


    Question add(String question, String answer);
    Question add(String question);
    Question remove(String question);
    Collection<Question> getAll();
    Question getRandomQuestion();
}
