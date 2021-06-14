package it.eng.effector.processors.ais;

import it.eng.rslab.rdf4j.inference.MultipleRulesInference;
import it.eng.rslab.rdf4j.inference.MultipleRulesInferenceFactory;
import org.eclipse.rdf4j.query.QueryLanguage;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.sail.SailRepository;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.RDFHandler;
import org.eclipse.rdf4j.rio.RDFParser;
import org.eclipse.rdf4j.rio.Rio;
import org.eclipse.rdf4j.sail.config.SailRegistry;
import org.eclipse.rdf4j.sail.memory.MemoryStore;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestSaving {
    public static void main(String[] args) throws IOException {
//        RDFHandler rdfWriter = Rio.createWriter(RDFFormat.TURTLE, outputStream);
//        RDFParser rdfParser = Rio.createParser(RDFFormat.RDFJSON);
//        rdfParser.setRDFHandler(rdfWriter);
//        rdfParser.parse(inputStream);
    }
}
