package com.example.sbb.example.chapter2Test;

import com.example.sbb.example.chapter2Test.answer.Answer;
import com.example.sbb.example.chapter2Test.answer.AnswerRepository;
import com.example.sbb.example.chapter2Test.question.Question;
import com.example.sbb.example.chapter2Test.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@Test
	void testJpa() {
	}

}
