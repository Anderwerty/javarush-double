package ua.javarush.module3.lesson16;

public class Example3 {
    public static void main(String[] args) {

    }
}

// CSV/DOC/JSON
interface ReportGeneration {
    String generateReport(ReportDataCollection reportDataCollection);
}

class XmlReportGeneration implements ReportGeneration {

    @Override
    public String generateReport( ReportDataCollection reportDataCollection) {
        return reportDataCollection.collectData();
    }
}

class PDFReportGeneration implements ReportGeneration {

    @Override
    public String generateReport(ReportDataCollection reportDataCollection) {
        return null;
    }
}

// week, day, ???
interface ReportDataCollection {
    String collectData();
}

class MonthReportDataCollection implements ReportDataCollection {

    @Override
    public String collectData() {
        return null;
    }
}

class YearReportDataCollection implements ReportDataCollection {

    @Override
    public String collectData() {
        return null;
    }
}
