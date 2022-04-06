package com.adapter.objectadapter;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class VoltageAdapter  implements IVoltage5V{
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (voltage220V != null){
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器,进行适配");
            dst = src/44;
            System.out.println("适配完成，输出的电压为 = "+dst);

        }
        return dst;
    }
}
