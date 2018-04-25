public class clas {
    @Override
    protected void finalize() throws Throwable{
        //some code here - этот код будет выполнен перед удалением объектов сборщиком мусора
        super.finalize();//
    }
}

