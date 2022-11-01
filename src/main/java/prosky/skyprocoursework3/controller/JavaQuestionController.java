package prosky.skyprocoursework3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import prosky.skyprocoursework3.impl.QuestionService;
import prosky.skyprocoursework3.model.Question;

@RestController
@RequestMapping(path = "/exam")
public class JavaQuestionController {
    private final QuestionService questionService;
    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(path = "/java/add")
    public Question addQuestion(@RequestParam("question") String question,
                                @RequestParam("question") String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping(path = "/java/remove")
    public Question removeQuestion(@RequestParam("question") String question,
                               @RequestParam("question") String answer) {
        return questionService.remove(question);
    }

    @GetMapping
    public Question getQuestion() {
        return questionService.getRandomQuestion();
    }

}
