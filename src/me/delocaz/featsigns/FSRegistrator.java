package me.delocaz.featsigns;

import com.google.common.collect.Lists;
import java.util.List;
import me.delocaz.featsigns.fsigns.FCommand;
import me.delocaz.featsigns.fsigns.FTelePos;
import me.delocaz.featsigns.fsigns.FTest;

public class FSRegistrator {

    public List<FSign> register() {
        List<FSign> l = Lists.newArrayList();
        l.add(new FTest());
        l.add(new FCommand());
        l.add(new FTelePos());
        return l;
    }
}
