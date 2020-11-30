package baseball;

import java.util.Arrays;

public class Game {

	Player player = new Player();
	Hint hint = new Hint();
	Answer answer = new Answer();

	// 실제 게임을 실행하는 함수
	public void startGame() {
		answer.makeAnswer();
    	System.out.println("-> target "+ Arrays.toString(answer.answerNum));
    	while(!hint.flag) {
    		player.getPlayerNum();
    		hint.makeHint(answer.answerNum, player.playerNum);
    		hint.clearStrikeAndBall();
    	}
    	hint.flag = false;
    	hint.clearStrikeAndBall();
	}
}
