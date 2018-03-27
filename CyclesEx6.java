public class CyclesEx6 {
/*    6) В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю
    трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
            «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме
    последних трёх цифр, как, например, в билетах с номерами 003102 или 567576. Трамвайное депо
    решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает, как много
    сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
    */
    public static void main(String[] args){
        int index0 = 0 , index1 = 0 , index2 = 0, index3 = 0, index4 = 0, index5 = 0; // Вопрос: Обязательно ли инициализировать переменные или как-то можно этого избежать?
        int numOfTickets = 0;
       for(int i = 1; i < 1000000; i++){
       //    int i = 432794;
            index0 = i/100000;
            index1 = i%100000/10000;
            index2 = i%10000/1000;

            index3 = i%1000/100;
            index4 = i%100/10;
            index5 = i%10;

            if ((index0 + index1 + index2) == (index3 + index4 + index5))
                numOfTickets++;
       }
        System.out.println(numOfTickets);
    }
}