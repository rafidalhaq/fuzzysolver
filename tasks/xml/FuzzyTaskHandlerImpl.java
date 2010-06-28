/*
 * File:           FuzzyTaskHandlerImpl.java
 * Date:           22. Juni 2010  17:21
 *
 * @author  malygos
 * @version generated by NetBeans XML module
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tasks.xml;

import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/**
 *
 * @author malygos
 */
public class FuzzyTaskHandlerImpl implements FuzzyTaskHandler {
    public static final boolean DEBUG = false;

    public void start_jobs(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_jobs: " + meta);
        }
    }

    public void end_jobs() throws SAXException {
        if (DEBUG) {
            System.err.println("end_jobs()");
        }
    }

    public void handle_connection(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_connection: " + meta);
        }
    }

    public void start_task(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_task: " + meta);
        }
    }

    public void end_task() throws SAXException {
        if (DEBUG) {
            System.err.println("end_task()");
        }
    }

    public void handle_job(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_job: " + meta);
        }
    }

    public void start_rules(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_rules: " + meta);
        }
    }

    public void end_rules() throws SAXException {
        if (DEBUG) {
            System.err.println("end_rules()");
        }
    }

    public void handle_size(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_size: " + meta);
        }
    }

    public void start_variables(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_variables: " + meta);
        }
    }

    public void end_variables() throws SAXException {
        if (DEBUG) {
            System.err.println("end_variables()");
        }
    }

    public void start_function(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_function: " + meta);
        }
    }

    public void end_function() throws SAXException {
        if (DEBUG) {
            System.err.println("end_function()");
        }
    }

    public void handle_id(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_id: " + meta);
        }
    }

    public void handle_point(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_point: " + meta);
        }
    }

    public void start_graph(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_graph: " + meta);
        }
    }

    public void end_graph() throws SAXException {
        if (DEBUG) {
            System.err.println("end_graph()");
        }
    }

    public void handle_name(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_name: " + meta);
        }
    }

    public void handle_rule(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_rule: " + meta);
        }
    }

    public void start_part(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_part: " + meta);
        }
    }

    public void end_part() throws SAXException {
        if (DEBUG) {
            System.err.println("end_part()");
        }
    }

    public void start_variable(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_variable: " + meta);
        }
    }

    public void end_variable() throws SAXException {
        if (DEBUG) {
            System.err.println("end_variable()");
        }
    }

    public void setDocumentLocator(Locator locator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startDocument() throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void endDocument() throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startPrefixMapping(String prefix, String uri) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void endPrefixMapping(String prefix) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void processingInstruction(String target, String data) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void skippedEntity(String name) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}