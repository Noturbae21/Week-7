public class Scene {
    String description;
    String option1Text;
    Scene option1Scene;
    int option1Damage;
    int option1Score;

    String option2Text;
    Scene option2Scene;
    int option2Damage;
    int option2Score;

    String option3Text;
    Scene option3Scene;
    int option3Damage;
    int option3Score;

    public Scene(String description) {
        this.description = description;
    }

    public Scene(String description,
                 String option1Text, Scene option1Scene, int option1Damage, int option1Score,
                 String option2Text, Scene option2Scene, int option2Damage, int option2Score,
                 String option3Text, Scene option3Scene, int option3Damage, int option3Score) {
        this.description = description;
        this.option1Text = option1Text;
        this.option1Scene = option1Scene;
        this.option1Damage = option1Damage;
        this.option1Score = option1Score;

        this.option2Text = option2Text;
        this.option2Scene = option2Scene;
        this.option2Damage = option2Damage;
        this.option2Score = option2Score;

        this.option3Text = option3Text;
        this.option3Scene = option3Scene;
        this.option3Damage = option3Damage;
        this.option3Score = option3Score;
    }
}
