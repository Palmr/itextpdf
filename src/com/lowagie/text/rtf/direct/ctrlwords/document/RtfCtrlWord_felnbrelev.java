/* $Id$
 * $Name$
 *
 * Copyright 2007 by Howard Shank (hgshank@yahoo.com)
 *
 * The contents of this file are subject to the Mozilla Public License Version 1.1
 * (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the License.
 *
 * The Original Code is 'iText, a free JAVA-PDF library'.
 *
 * The Initial Developer of the Original Code is Bruno Lowagie. Portions created by
 * the Initial Developer are Copyright (C) 1999-2006 by Bruno Lowagie.
 * All Rights Reserved.
 * Co-Developer of the code is Paulo Soares. Portions created by the Co-Developer
 * are Copyright (C) 2000-2006 by Paulo Soares. All Rights Reserved.
 *
 * Contributor(s): all the names of the contributors are added in the source code
 * where applicable.
 *
 * Alternatively, the contents of this file may be used under the terms of the
 * LGPL license (the ?GNU LIBRARY GENERAL PUBLIC LICENSE?), in which case the
 * provisions of LGPL are applicable instead of those above.  If you wish to
 * allow use of your version of this file only under the terms of the LGPL
 * License and not to allow others to use your version of this file under
 * the MPL, indicate your decision by deleting the provisions above and
 * replace them with the notice and other provisions required by the LGPL.
 * If you do not delete the provisions above, a recipient may use your version
 * of this file under either the MPL or the GNU LIBRARY GENERAL PUBLIC LICENSE.
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the MPL as stated above or under the terms of the GNU
 * Library General Public License as published by the Free Software Foundation;
 * either version 2 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Library general Public License for more
 * details.
 *
 * If you didn't download this code from the following link, you should check if
 * you aren't using an obsolete version:
 * http://www.lowagie.com/iText/
 */
 
package com.lowagie.text.rtf.direct.ctrlwords.document;

import com.lowagie.text.rtf.direct.RtfParser;
import com.lowagie.text.rtf.direct.ctrlwords.basectrlwords.RtfCtrlWordBase_felnbrelev;

/**
 * Description:
 * 	,"This control word specifies an alternate set of characters
 * 	that may be used to determine that characters can begin or
 * 	end a line when kinsoku line breaking rules are enabled.
 *
 * 		Specifically, the following settings shall be used instead
 * 	(for brevity, only those settings that are different than
 * 	the default behavior of Microsoft Office Word 2007 are
 * 	listed below):
 * 	Chinese (Simplified)
 * 	Cannot start a
 * 	line:
 * 	!),.:;?]}?::???????:????>??????!'),.:;?]`|}~?
 *
 * 		Cannot end a line:
 * 	([{::??<??????(.[{??
 * 	Chinese
 * 	(Traditional)
 * 	Cannot start a line:
 *
 * 		!),.:;?]}?::????::???'???>?????????????????????????????!),.
 * 	;?|}?
 * 	Korean
 * 	Cannot end a line:
 *
 * 		([\{????<?????$([{?
 * 	Example: Consider a line of text in
 * 	a WordprocessingML document within a paragraph marked as
 * 	Chinese (Simplified) that begins with a % symbol, as
 * 	follows:
 * 	%...
 * 	Typically, the kinsoku settings for
 * 	Chinese (Simplified) do not allow this character to begin a
 * 	line, so the character before that symbol would be moved
 * 	down onto this line:
 * 	?%...
 * 	However, if this
 * 	compatibility setting is present, then the alternate kinsoku
 * 	rules are in place, which do not prevent the % character
 * 	from beginning the new line, resulting in the following
 * 	output:
 * 	%...
 * 	Note   This control word is used to
 * 	maintain compatibility with documents created by Microsoft
 * 	Office Word 2003
 * Group:
 * 	Document Formatting Properties
 * Type:
 * 	Flag
 * Default Param:
 * 	0
 * Pass Default:
 * 	false
 * RTF Version:
 * 	
 */

public class RtfCtrlWord_felnbrelev extends RtfCtrlWordBase_felnbrelev {

	public RtfCtrlWord_felnbrelev(RtfParser rtfParser){
		super(rtfParser);
	}

}