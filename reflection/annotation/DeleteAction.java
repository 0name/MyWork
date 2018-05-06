package reflection.annotation;

@PermRequired(User.Permission.ADMIN) // сообщаем что этот класс может использовать пользователь с правами ADMIN. Можно записать аннотацию к методам(Например к delete)
public class DeleteAction {

    public void delete(User user){}
}
