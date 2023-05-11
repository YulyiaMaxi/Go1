import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {


    @Test
    public void shouldMatch() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям"); //здесь кладем объект
        boolean actual = simpleTask.matches("Позвонить"); //здесь вызываем метод из SimpleTask
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatch1() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean expected = true;
        boolean actual = epic.matches("Хлеб");//здесь вызываем метод из epic boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatch2() {

        Meeting meeting = new Meeting(

                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("версии");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMatch3() {

        Meeting meeting = new Meeting(

                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("НетоБанка");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMatch4() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям"); //здесь кладем объект
        boolean actual = simpleTask.matches("учителю"); //здесь вызываем метод из SimpleTask
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatch5() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean expected = false;
        boolean actual = epic.matches("Сосиски");//здесь вызываем метод из epic boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatch6() {

        Meeting meeting = new Meeting(

                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("вкладки");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMatch7() {

        Meeting meeting = new Meeting(

                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("вторник");
        Assertions.assertEquals(expected, actual);

    }


}

