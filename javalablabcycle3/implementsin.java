interface Student {
    int getAcademicScore();
}

interface Sports {
    int getSportsScore();
}

class Result implements Student, Sports {
    private int academicScore;
    private int sportsScore;

    public Result(int academicScore, int sportsScore) {
        this.academicScore = academicScore;
        this.sportsScore = sportsScore;
    }

    public int getAcademicScore() {
        return academicScore;
    }

    public int getSportsScore() {
        return sportsScore;
    }

    public void displayScores() {
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sportsScore);
    }
}

public class implementsin {
    public static void main(String[] args) {
        Result result = new Result(90, 85);
        result.displayScores();
    }
}   
