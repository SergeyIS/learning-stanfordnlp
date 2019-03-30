package com.sergeyis.learning.stanfordnlp;

import edu.stanford.nlp.ie.crf.CRFClassifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private static final String propertiesPath = "src/main/resources/austen.prop";
    private static final String testPath = "src/main/resources/jane-austen-emma-ch2.tsv";
    private static final String classifierPath = "src/main/resources/ner-model.ser.gz";

    public static void main(String[] args) throws Exception {
        test();
    }

    public static void train() throws Exception {
        CRFClassifier.main(new String[] {"-prop", propertiesPath});
    }

    public static void test() throws Exception {
        CRFClassifier.main(new String[] {"-loadClassifier", classifierPath, "-testFile", testPath});
    }
}
