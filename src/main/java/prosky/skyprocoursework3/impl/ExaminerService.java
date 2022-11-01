package prosky.skyprocoursework3.impl;

import prosky.skyprocoursework3.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
