package de.tum.in.tumcampusapp.models;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * This class is dealing with the deserialization of the output of TUMOnline to
 * the method "sucheLehrveranstaltungen" or "eigeneLehrveranstaltungen".
 * 
 * @author Daniel Mayr
 * @see LecturesSearchRow
 * @see http://simple.sourceforge.net/download/stream/doc/tutorial/tutorial.php
 * @review Thomas Behrens
 */
@Root(name = "events")
public class KalendarRowSet {

	@ElementList(inline = true)
	private List<KalendarRow> kalendarList;

	public List<KalendarRow> getKalendarList() {
		return kalendarList;
	}

	public void setKalendarList(List<KalendarRow> kalendarList) {
		this.kalendarList = kalendarList;
	}

}
