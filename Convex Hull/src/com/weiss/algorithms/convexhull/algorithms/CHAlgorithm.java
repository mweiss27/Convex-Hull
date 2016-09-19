package com.weiss.algorithms.convexhull.algorithms;

import java.util.Arrays;
import java.util.List;

import com.weiss.algorithms.convexhull.util.Point;

public abstract class CHAlgorithm {

	protected List<Point> points;

	public CHAlgorithm(final Point[] points) {
		this.points = Arrays.asList(points); // This list cannot be modified via add/remove
	}

	public abstract Point[] generateConvexHull();

}
