package core.basesyntax.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportDaoCsvImpl implements ReportDao {
    private static final String RESOURCES_PATH = "src" + File.separator + "main" + File.separator
                + "resources" + File.separator;

    @Override
    public void saveReport(String report, String fileName) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(RESOURCES_PATH + fileName, true))) {
            bufferedWriter.write(report);
        } catch (IOException e) {
            throw new RuntimeException("File not found " + fileName);
        }
    }
}
