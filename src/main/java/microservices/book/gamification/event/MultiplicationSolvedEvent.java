package microservices.book.gamification.event;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 시스템에서 곱셈 문제가 해결되었다는 사실을 모델링한 이벤트.
 * 곱셈에 대한 컨텍스트 정보를 제공.
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
class MultiplicationSolvedEvent implements Serializable {

  private final Long multiplicationResultAttemptId;
  private final Long userId;
  private final boolean correct;
  
  public MultiplicationSolvedEvent() {
	this.multiplicationResultAttemptId = (long) 0;
	this.userId = (long) 0;
	this.correct = false;
	  
  }

}
