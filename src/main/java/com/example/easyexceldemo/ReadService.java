package com.example.easyexceldemo;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhuguowei on 2020/12/16.
 */
@Service
@Slf4j
public class ReadService {

    public void read(File file) {
        long time1 = System.nanoTime();
        DataListener listener = new DataListener();
        EasyExcel.read(file, ExcelData.class, listener).sheet().doRead();
        log.info("Done. Total took time: {} ms", (TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - time1)));
    }

    static class DataListener extends AnalysisEventListener<ExcelData>  {
        final List<ExcelData> list = new ArrayList<>();
        int index = 0;
        @Override
        public void invoke(ExcelData data, AnalysisContext context) {
            list.add(data);
            log.info("row index: {}", ++index);
        }

        @Override
        public void doAfterAllAnalysed(AnalysisContext context) {
            log.info("Total received records: {} ", list.size());
        }
    };
}
