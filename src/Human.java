public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;
    Human(String name, int yearOfBirth, String town, String jobTitle){

        if (name != null && !name.equals("")) {
            this.name = name;
        } else this.name = "Информация не указана";

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else this.yearOfBirth = 0;

        if (town != null && !town.equals("")) {
            this.town = town;
        } else this.town = "Информация не указана";

        if (jobTitle != null && !jobTitle.equals("")) {
            this.jobTitle = jobTitle;
        } else this.jobTitle = "Информация не указана";

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
