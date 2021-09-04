package microservices.book.gamification.client.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import microservices.book.gamification.client.MultiplicationResultAttemptDeserializer;

/**
 * User 가 Multiplication 을 계산한 답안을 정의한 클래스
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@JsonDeserialize(using = MultiplicationResultAttemptDeserializer.class) // 자동으로 역직렬화를 해 줌
// 곱셈 마이크로서비스에 있는 동일 이름의 클래스와 다름
// 클라이언트가 필요로 하는 정보를 MultiplicationResultAttemptDeserializer가 추출해서 이 클래스의 객체를 생성할 것임
public final class MultiplicationResultAttempt {

  private final String userAlias;

  private final int multiplicationFactorA;
  private final int multiplicationFactorB;
  private final int resultAttempt;

  private final boolean correct;

  // JSON/JPA 를 위한 빈 생성자
  MultiplicationResultAttempt() {
    userAlias = null;
    multiplicationFactorA = -1;
    multiplicationFactorB = -1;
    resultAttempt = -1;
    correct = false;
  }

}
