package Vladimir.Gl;

public class Post {
    public String name;
    public String passport;
    public String patronymic;
    public String phone;
    public String surname;
    public String subscription;
    public FormDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public  void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public FormDate getBirthday() {
        return birthday;
    }

    public void setBirthday(FormDate birthday) {
        this.birthday = birthday;
    }


}
