package be.ugent.mmlab.rml.input.main;

import be.ugent.mmlab.rml.input.InputFactory;
import be.ugent.mmlab.rml.input.config.DataRetrievalHandlerConfiguration;
import java.util.logging.Level;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RML Data Retrieval Handler : Main
 *
 * @author andimou
 */
public class Main {
    
    // Log
    static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String map_doc;
        CommandLine commandLine ;
        
        log.error("Hello World");
        
        try {
            commandLine = DataRetrievalHandlerConfiguration.parseArguments(args);
            
            log.error("commandLine" + commandLine);

            if (commandLine.hasOption("m")) {
                map_doc = commandLine.getOptionValue("m", null);
            }
            
            InputFactory inputFactory ;

        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (log.isDebugEnabled()) {
            log.debug("Hello World!");
            log.debug("Nothing happens...");
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("RML Data Retrieval Handler");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("");

        System.out.println("RML Processor - Extracting Mapping Document.");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("");
    }
    
    
}