package Serialisation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

public class LaunchStatExtern implements Externalizable {
    private static final int VERSION = 0;

    private int LaunchCount;
    private Date lastLaunch;
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(VERSION);
        out.writeInt(LaunchCount);
        out.writeObject(lastLaunch);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        int version = in.readInt();
        if (version > VERSION){
            throw new IOException("unsupported version of class: " + version);
        }
        LaunchCount = in.readInt();
        lastLaunch = (Date) in.readObject() ;
    }

    public void updateState(){
        LaunchCount++;
        lastLaunch = new Date();
    }

    @Override
    public String toString(){
        return "LaunchStat{" + "LaunchCount=" + LaunchCount + ",lastLaunch=" + lastLaunch + "}";
    }

    public boolean isFirstLaunch(){
        return LaunchCount == 0 && lastLaunch == null; //проверяет щетчик
    }
}
