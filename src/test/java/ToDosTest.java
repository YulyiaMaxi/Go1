
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToDosTest {
    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям"); //здесь кладем объекты
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        ToDos toDos = new ToDos();

        toDos.add(simpleTask);//здесь пишем методы, заведенные в классе менеджера
        toDos.add(epic);
        toDos.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = toDos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearch() {
        ToDos toDos = new ToDos();//здесь кладем объект
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям"); //здесь кладем объекты
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        toDos.add(simpleTask);//здесь пишем методы, заведенные в классе менеджера
        toDos.add(epic);
        toDos.add(meeting);
        Task[] actual = toDos.search("Позвонить"); //здесь вызываем метод из toDos
        Task[] expected = {simpleTask};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearch3() {
        ToDos toDos = new ToDos();//здесь кладем объект
        SimpleTask simpleTask = new SimpleTask(5, "Купить Яйца"); //здесь кладем объекты
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"}; // кроме самого объекта кладем массив, которй тот содержит
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        toDos.add(simpleTask);//здесь пишем методы, заведенные в классе менеджера
        toDos.add(epic);
        toDos.add(meeting);
        Task[] actual = toDos.search("Яйца"); //здесь вызываем метод из toDos
        Task[] expected = {simpleTask, epic};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearch4() {
        ToDos toDos = new ToDos();//здесь кладем объект
        SimpleTask simpleTask = new SimpleTask(5, "Доделать приложения"); //здесь кладем объекты
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        toDos.add(simpleTask);//здесь пишем методы, заведенные в классе менеджера
        toDos.add(epic);
        toDos.add(meeting);
        Task[] actual = toDos.search("приложения"); //здесь вызываем метод из toDos
        Task[] expected = {simpleTask, meeting};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearch5() {
        ToDos toDos = new ToDos();//здесь кладем объект
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям"); //здесь кладем объекты
        String[] subtasks = {"Банка сгущенки", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        toDos.add(simpleTask);//здесь пишем методы, заведенные в классе менеджера
        toDos.add(epic);
        toDos.add(meeting);
        Task[] actual = toDos.search("Банка"); //здесь вызываем метод из toDos
        Task[] expected = {epic, meeting};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearch6() {
        ToDos toDos = new ToDos();//здесь кладем объект
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям"); //здесь кладем объекты
        String[] subtasks = {"Банка сгущенки", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        toDos.add(simpleTask);//здесь пишем методы, заведенные в классе менеджера
        toDos.add(epic);
        toDos.add(meeting);
        Task[] actual = toDos.search("Баранки"); //здесь вызываем метод из toDos
        Task[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }
}
