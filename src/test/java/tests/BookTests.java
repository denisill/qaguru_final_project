package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class BookTests {

    @Test
    @DisplayName("Проверка содержимого главной страницы сайта")
    public void testsForBook24MainPageAndCheckContent() {

        step("Открываем главную страницу book24", () -> {
            open("http://book24.ru");

            step("Проверяем, что шапка содержит элементы" + "Официальный магазин издательской группы ЭКСМО-АСТ" + "О нас" + "Оплата", () -> {
                $(".header").shouldHave(text("Официальный магазин издательской группы ЭКСМО-АСТ"));
                $(".header").shouldHave(text("О нас"));
                $(".header").shouldHave(text("Оплата"));
            });
            step("Проверяем содержимое каталога", () -> {
                $(".nav-icon").click();
                //далее проверяем какие ниб элементы
            });
        });
    }

    @Test
    @DisplayName("Проверка строки поиска сайта")
    public void tests() {}
}
