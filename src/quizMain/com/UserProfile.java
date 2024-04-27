package quizMain.com;

public class UserProfile {
	 private String username;
	    private String password;
	    private int correctAnswers;
	    private int totalQuestions;

	    public UserProfile(String username, String password) {
	        this.username = username;
	        this.password = password;
	        this.correctAnswers = 0;
	        this.totalQuestions = 0;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public boolean authenticate(String username, String password) {
	        return this.username.equals(username) && this.password.equals(password);
	    }

	    public void updateScore(boolean isCorrect) {
	        if (isCorrect) {
	            correctAnswers++;
	        }
	        totalQuestions++;
	    }

	    public void displayReport() {

	        System.out.println("===================================================");
	        System.out.println("              Quiz Report for " + username);
	        System.out.println("---------------------------------------------------");
	        System.out.println("Correct Answers: " + correctAnswers);
	        System.out.println("Incorrect Answers: " + (totalQuestions - correctAnswers));
	        System.out.println("Total Questions: " + totalQuestions);
	        System.out.println("===================================================");

	        int totalScore = correctAnswers;
	        String performanceLevel;

	        if (totalScore == 5) {
	        	performanceLevel = "Immortal 🏆";
	        } else if (totalScore == 4) {
	        	performanceLevel = "Gold 🥇";
	        } else if (totalScore == 3) {
	        	performanceLevel = "Silver 🥈";
	        } else if (totalScore == 2) {
	        	performanceLevel = "Bronze 🥉";
	        } else if (totalScore == 1) {
	        	performanceLevel = "Iron 🔩";
	        } else {
	        	performanceLevel = "Not Labeled ❓";
	        }

	        System.out.println("        Performance Level: " + performanceLevel);
	        System.out.println("===================================================");
	    }
}
