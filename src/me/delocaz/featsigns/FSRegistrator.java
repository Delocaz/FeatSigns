package me.delocaz.featsigns;

import com.google.common.collect.Lists;
import java.util.List;
import me.delocaz.featsigns.fsigns.FCommand;
import me.delocaz.featsigns.fsigns.FDay;
import me.delocaz.featsigns.fsigns.FNight;
import me.delocaz.featsigns.fsigns.FStorm;
import me.delocaz.featsigns.fsigns.FSun;
import me.delocaz.featsigns.fsigns.FTelePos;
import me.delocaz.featsigns.fsigns.FTest;

public class FSRegistrator {

    public List<FSign> register() {
        List<FSign> l = Lists.newArrayList();
        l.add(new FTest());
        l.add(new FCommand());
        l.add(new FTelePos());
        l.add(new FSun());
        l.add(new FStorm());
        l.add(new FDay());
        l.add(new FNight());
        return l;
    }
}
