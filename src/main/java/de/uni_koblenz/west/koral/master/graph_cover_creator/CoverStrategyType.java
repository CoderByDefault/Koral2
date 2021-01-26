package de.uni_koblenz.west.koral.master.graph_cover_creator;

/**
 * Declares all supported graph cover strategies.
 * 
 * @author Arsalan Gul, Adnan Akhter, Daniel Janke &lt;danijankATuni-koblenz.de&gt;
 *
 */
public enum CoverStrategyType {

  SUBJECT, HIERARCHICAL, MIN_EDGE_CUT, PREDICATE, HORIZONTAL, TCV_MIN, RECURSIVE, EDGE_COLORING, MEC_OVER, MOLECULE_HASH;

}