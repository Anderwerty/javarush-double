package ua.javarush.module2.lesson18;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Example8 {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(client.getAge());
        client.setAge(10);
        System.out.println(client);

        Client build = Client.builder()
                .withAge(100)
                .withEmail("email@gmail.com")
                .build();
    }
}

//https://projectlombok.org/
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
@Data
@Builder(setterPrefix = "with")
class Client{
    private int age;
    private String name;
    private String surname;
    @ToString.Exclude
    private String email;
    @EqualsAndHashCode.Exclude
    private LocalDate birth;
    private int number;

    public void method(){
        System.out.println(number);
    }

    //Lombok
}

@UtilityClass
class Service{

}