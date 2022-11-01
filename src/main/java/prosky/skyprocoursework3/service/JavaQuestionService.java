package prosky.skyprocoursework3.service;

import org.springframework.stereotype.Service;
import prosky.skyprocoursework3.exception.QuestionNotExistException;
import prosky.skyprocoursework3.impl.QuestionService;
import prosky.skyprocoursework3.model.Question;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    private Random random = new Random();

    private final Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        Question questionItem = new Question(question, answer);
        return questionItem;
    }

    @Override
    public Question add(String question) {
        Question questionItem = new Question(question, null);
        return questionItem;
    }

    @Override
    public Question remove(String question) {
        Question questionItem = new Question(question);
        if (!questions.contains(questionItem)) {
            questions.remove(questionItem);
        } else {
            throw new QuestionNotExistException();
        }
        return questionItem;
    }

    @Override
    public Collection<Question> getAll() {
        return new HashSet<>(questions);
    }

    @Override
    public Question getRandomQuestion() {
        return new ArrayList<>(questions).get(random.nextInt(questions.size()));
    }
}
