public class Human {
    String name;
    private int yearOfBirth;
    private String town;
    String jobTitle;
    Human(String name, int yearOfBirth, String town, String jobTitle){

        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else this.name = "Информация не указана";

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else this.yearOfBirth = 0;

        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else this.town = "Информация не указана";

        if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()) {
            this.jobTitle = jobTitle;
        } else this.jobTitle = "Информация не указана";

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else this.yearOfBirth = 0;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else this.town = "Информация не указана";
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + town +
                ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle +
                ". Будем знакомы!";
    }
}
