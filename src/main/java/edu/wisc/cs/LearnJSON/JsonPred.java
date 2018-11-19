package edu.wisc.cs.LearnJSON;

import com.google.common.collect.ImmutableList;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.tuple.ImmutablePair;

/**
 * JsonPred: json letters represented as predicates  
 */
public class JsonPred {

	JsonLetter lett;
	JsonLetter.Control cont;

	public JsonPred(JsonLetter letter) {
		this.lett = letter;
	}

	public JsonPred(JsonLetter.Control cont) {
		this.cont = cont;
	}

	public boolean isSatisfiedBy(JsonLetter lett) {
		if (cont != null) {
			return lett.cont.equals(lett.cont);
		}
		return this.lett.equals(lett);
	}

	@Override
	public String toString() {
		return "== "+this.lett;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof JsonLetter) {
			return ((JsonLetter) obj).equals(this.lett);
		}
	}

	@Override
	public int hashCode() {
		return lett.hashCode();
	}
}
