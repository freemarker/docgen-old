package org.freemarker.docgen;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class DocBook5Constants {
    
    // Can't be instantiated
    private DocBook5Constants() {
        // Nop
    }

    public static final String XMLNS_DOCBOOK5 = "http://docbook.org/ns/docbook";
    
    public static final String E_BOOK = "book";
    public static final String E_ARTICLE = "article";
    public static final String A_CONFORMANCE = "conformance";
    public static final String AV_CONFORMANCE_DOCGEN = "docgen";
    public static final String E_SECTION = "section";
    public static final String E_SIMPLESECT = "simplesect";
    public static final String E_PARA = "para";
    public static final String E_ITEMIZEDLIST = "itemizedlist";
    public static final String E_IMAGEDATA = "imagedata";
    public static final String E_MEDIAOBJECT = "mediaobject";
    public static final String E_FIGURE = "figure";
    public static final String E_INFORMALFIGURE = "informalfigure";
    public static final String A_FILEREF = "fileref";
    public static final String E_ORDEREDLIST = "orderedlist";
    public static final String E_LISTITEM = "listitem";
    public static final String E_PROGRAMLISTING = "programlisting";
    public static final String A_LANGUAGE = "language";
    public static final String A_ROLE = "role";
    public static final String E_FOOTNOTE = "footnote";
    public static final String E_CHAPTER = "chapter";
    public static final String E_PART = "part";
    public static final String E_APPENDIX = "appendix";
    public static final String E_GLOSSARY = "glossary";
    public static final String E_GLOSSENTRY = "glossentry";
    public static final String E_INDEX = "index";
    public static final String E_INFORMALTABLE = "informaltable";
    public static final String E_TABLE = "table";
    public static final String E_PREFACE = "preface";
    public static final String E_QUANDAENTRY = "qandaentry";
    public static final String E_ANCHOR = "anchor";
    public static final String E_TITLE = "title";
    public static final String E_SUBTITLE = "subtitle";
    public static final String E_INFO = "info";
    
    public static final String A_XML_ID = "xml:id";
    public static final String A_XREFLABEL = "xreflabel";
    
    public static final String E_INDEXTERM = "indexterm";
    public static final String E_PRIMARY = "primary";
    public static final String E_SECONDARY = "secondary";

    public static final String E_COLGROUP = "colgroup";
    public static final String E_COL = "col";
    public static final String A_ALIGN = "align";
    public static final String A_VALIGN = "valign";
    public static final String A_SPAN = "span";
    public static final String A_ROWSPAN = "rowspan";
    public static final String A_COLSPAN = "colspan";
    public static final String E_TR = "tr";
    public static final String E_TBODY = "tbody";
    public static final String E_THEAD = "thead";
    public static final String E_TFOOT = "tfoot";
    public static final String E_TD = "td";
    public static final String E_TH = "th";

    public static final String E_OLINK = "olink";
    public static final String E_LINK = "link";
    
    public static final String E_NOTE = "note";
    public static final String E_WARNING = "warning";
    
    /**
     * Elements that are like parts, chapters, sections and like.
     */
    public static final Set<String> DOCUMENT_STRUCTURE_ELEMENTS;
    static {
        HashSet<String> docStructElems = new HashSet<String>();
        
        docStructElems.add(E_APPENDIX);
        docStructElems.add(E_BOOK);
        docStructElems.add(E_ARTICLE);
        docStructElems.add(E_CHAPTER);
        docStructElems.add(E_GLOSSARY);
        docStructElems.add(E_INDEX);
        docStructElems.add(E_PART);
        docStructElems.add(E_PREFACE);
        docStructElems.add(E_SECTION);
        docStructElems.add(E_SIMPLESECT);
        
        DOCUMENT_STRUCTURE_ELEMENTS = Collections.unmodifiableSet(
                docStructElems);
    }

    /**
     * Elements that directly generates visible artifacts on the page and
     * occur directly under document-structural elements.
     */
    public static final Set<String> VISIBLE_TOPLEVEL_ELEMENTS;
    static {
        HashSet<String> visibleTopLevelElems = new HashSet<String>();
        
        visibleTopLevelElems.addAll(DOCUMENT_STRUCTURE_ELEMENTS);
        visibleTopLevelElems.add(E_INFO);
        visibleTopLevelElems.add(E_TITLE);
        visibleTopLevelElems.add(E_SUBTITLE);
        visibleTopLevelElems.add(E_PARA);
        visibleTopLevelElems.add(E_TABLE);
        visibleTopLevelElems.add(E_INFORMALTABLE);
        visibleTopLevelElems.add(E_ORDEREDLIST);
        visibleTopLevelElems.add(E_ITEMIZEDLIST);
        visibleTopLevelElems.add(E_MEDIAOBJECT);
        visibleTopLevelElems.add(E_FIGURE);
        visibleTopLevelElems.add(E_INFORMALFIGURE);
        visibleTopLevelElems.add(E_PROGRAMLISTING);
        visibleTopLevelElems.add(E_NOTE);
        visibleTopLevelElems.add(E_WARNING);
        
        VISIBLE_TOPLEVEL_ELEMENTS = Collections.unmodifiableSet(
                visibleTopLevelElems);
    }
    
}
