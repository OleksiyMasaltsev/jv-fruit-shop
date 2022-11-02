package core.basesyntax.utils;

import core.basesyntax.db.FruitStorage;
import java.util.ArrayList;
import java.util.List;

public class ReportUtil {
    private static final String CSV_OUTPUT_HEADER = "fruit,quantity";
    private static final String SEPARATOR = ",";

    public List<String> generateReport(FruitStorage storage) {
        List<String> reportList = new ArrayList<>();
        reportList.add(CSV_OUTPUT_HEADER);
        storage.getStorage().forEach((key, value) -> reportList.add(key + SEPARATOR + value));
        return reportList;
    }
}