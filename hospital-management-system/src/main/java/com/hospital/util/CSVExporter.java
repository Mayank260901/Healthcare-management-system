package com.hospital.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVExporter {

    // Generic method to export any list of data to CSV
    public static <T> void exportToCSV(List<T> dataList, String[] headers, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            // Writing headers
            for (String header : headers) {
                writer.append(header).append(",");
            }
            writer.append("\n");

            // Writing data rows
            for (T data : dataList) {
                writer.append(data.toString()).append("\n");
            }

            System.out.println("CSV export successful: " + fileName);
        } catch (IOException e) {
            System.err.println("Error while exporting to CSV: " + e.getMessage());
            throw e;
        }
    }
}
