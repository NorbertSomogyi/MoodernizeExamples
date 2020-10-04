package application;

public class flickcurl_shapedata_s {
	private int created;
	private double alpha;
	private int points;
	private int edges;
	private Byte data;
	private Object data_length;
	private byte[][] file_urls;
	private int file_urls_count;
	private int is_donuthole;
	private int has_donuthole;
	
	public flickcurl_shapedata_s(int created, double alpha, int points, int edges, Byte data, Object data_length, byte[][] file_urls, int file_urls_count, int is_donuthole, int has_donuthole) {
		setCreated(created);
		setAlpha(alpha);
		setPoints(points);
		setEdges(edges);
		setData(data);
		setData_length(data_length);
		setFile_urls(file_urls);
		setFile_urls_count(file_urls_count);
		setIs_donuthole(is_donuthole);
		setHas_donuthole(has_donuthole);
	}
	public flickcurl_shapedata_s() {
	}
	
	public void command_print_shape() {
		int generatedCreated = this.getCreated();
		double generatedAlpha = this.getAlpha();
		int generatedPoints = this.getPoints();
		int generatedEdges = this.getEdges();
		int generatedIs_donuthole = this.getIs_donuthole();
		int generatedHas_donuthole = this.getHas_donuthole();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "created %d  alpha %2.2f  #points %d  #edges %d\n  is donuthole: %d  has donuthole: %d\n", generatedCreated, generatedAlpha, generatedPoints, generatedEdges, generatedIs_donuthole, generatedHas_donuthole);
		Object generatedData_length = this.getData_length();
		Byte generatedData = this.getData();
		if (generatedData_length > 0) {
			int s;
			s = (generatedData_length > 70 ? 70 : generatedData_length);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  Shapedata (%d bytes):\n    ", (int)generatedData_length);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(generatedData, 1, s, (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("...\n", (_iob[1]));
		} 
		int generatedFile_urls_count = this.getFile_urls_count();
		byte[][] generatedFile_urls = this.getFile_urls();
		if (generatedFile_urls_count > 0) {
			int j;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  Shapefile URLs: %d\n", generatedFile_urls_count);
			for (j = 0; j < generatedFile_urls_count; j++) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "    URL %d: %s\n", j, generatedFile_urls[j]);
			}
		} 
	}
	public flickcurl_shapedata_s flickcurl_places_getShapeHistory(flickcurl_s fc, Object place_id, int woe_id) {
		 doc = (null);
		 xpathCtx = (null);
		flickcurl_shapedata shapes = (null);
		byte[] woe_id_str = new byte[20];
		fc.flickcurl_init_params(0);
		if (!place_id && woe_id < 0) {
			return (null);
		} 
		if (place_id) {
			fc.flickcurl_add_param("place_id", place_id);
		} 
		if (woe_id >= 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(woe_id_str, "%d", woe_id);
			fc.flickcurl_add_param("woe_id", woe_id_str);
		} 
		fc.flickcurl_end_params();
		if (fc.flickcurl_prepare("flickr.places.getShapeHistory")) {
			;
		} 
		doc = fc.flickcurl_invoke();
		if (!doc) {
			;
		} 
		xpathCtx = /*Error: Function owner not recognized*/xmlXPathNewContext(doc);
		if (!xpathCtx) {
			fc.flickcurl_error("Failed to create XPath context for document");
			fc.setFailed(1);
			;
		} 
		flickcurl_shapedata_s flickcurl_shapedata_s = new flickcurl_shapedata_s();
		shapes = flickcurl_shapedata_s.flickcurl_build_shapes(fc, xpathCtx, ()"/rsp/shapes/shapedata|/rsp/shapes/shape", (null));
		int generatedFailed = fc.getFailed();
		if (generatedFailed) {
			if (shapes) {
				shapes.flickcurl_free_shapes();
			} 
			shapes = (null);
		} 
		return shapes/**
		 * flickcurl_places_getTopPlacesList:
		 * @fc: flickcurl context
		 * @place_type: The place type to cluster photos by. Valid place types are : neighbourhood, locality, region, country and continent
		 * @date: A valid date in YYYY-MM-DD format. The default is yesterday. (or NULL)
		 * @woe_id: Limit your query to only those top places belonging to a specific Where on Earth (WOE) identifier. (or NULL)
		 * @place_id: Limit your query to only those top places belonging to a specific Flickr Places identifier. (or NULL)
		 * 
		 * Return the top 100 most geotagged places for a day.
		 *
		 * Implements flickr.places.getTopPlacesList (1.12)
		 * 
		 * Return value: array of places or NULL on failure
		 **/;
	}
	/* -*- Mode: c; c-basic-offset: 2 -*-
	 *
	 * shape.c - Flickr shape support calls
	 *
	 * Copyright (C) 2009, David Beckett http://www.dajobe.org/
	 * 
	 * This file is licensed under the following three licenses as alternatives:
	 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
	 *   2. GNU General Public License (GPL) V2 or any newer version
	 *   3. Apache License, V2.0 or any newer version
	 * 
	 * You may not use this file except in compliance with at least one of
	 * the above three licenses.
	 * 
	 * See LICENSE.html or LICENSE.txt at the top of this package for the
	 * complete terms and further detail along with the license texts for
	 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
	 * 
	 */
	/**
	 * flickcurl_free_shape:
	 * @shape: shape object
	 *
	 * Destructor for shape object
	 */
	public void flickcurl_free_shape() {
		int i;
		do {
			if (!shape) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_shapedata is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\shape.c", 56, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		Byte generatedData = this.getData();
		if (generatedData) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedData);
		} 
		byte[][] generatedFile_urls = this.getFile_urls();
		int generatedFile_urls_count = this.getFile_urls_count();
		if (generatedFile_urls) {
			for (i = 0; i < generatedFile_urls_count; i++) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedFile_urls[i]);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedFile_urls);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(shape/**
		 * flickcurl_free_shapes:
		 * @shapes_object: shape object array
		 *
		 * Destructor for array of shape object
		 */);
	}
	public void flickcurl_free_shapes() {
		int i;
		do {
			if (!shapes_object) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_shapedata_array is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\shape.c", 82, __func__);
				return /*Error: Unsupported expression*/;
			} 
		} while (0);
		for (i = 0; shapes_object[i]; i++) {
			shapes_object[i].flickcurl_free_shape();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(shapes_object);
	}
	/* get shapedata from value */
	public flickcurl_shapedata_s flickcurl_build_shapes(flickcurl_s fc, Object xpathCtx, Object xpathExpr, Integer shape_count_p) {
		flickcurl_shapedata shapes = (null);
		int nodes_count;
		int shape_count;
		 xpathObj = (null);
		 nodes = new ();
		int i;
		xpathObj = /*Error: Function owner not recognized*/xmlXPathEvalExpression(xpathExpr, xpathCtx);
		if (!xpathObj) {
			fc.flickcurl_error("Unable to evaluate XPath expression \"%s\"", xpathExpr);
			fc.setFailed(1);
			;
		} 
		nodes = xpathObj.getNodesetval();
		nodes_count = /*Error: Function owner not recognized*/xmlXPathNodeSetGetLength(/* This is a max size - it can include nodes that are CDATA */nodes);
		shapes = (flickcurl_shapedata)/*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, nodes_count + 1);
		Object generatedData_length = shape.getData_length();
		int generatedFile_urls_count = shape.getFile_urls_count();
		byte[][] generatedFile_urls = shape.getFile_urls();
		int generatedFailed = fc.getFailed();
		if (shape_count_p) {
			shape_count_p = shape_count;
		} 
		if (generatedFailed) {
			if (shapes) {
				shapes.flickcurl_free_shapes();
			} 
			shapes = (null);
		} 
		return shapes;
	}
	public flickcurl_shapedata_s flickcurl_build_shape(flickcurl_s fc, Object xpathCtx, Object xpathExpr) {
		flickcurl_shapedata[][] shapes = new flickcurl_shapedata();
		flickcurl_shapedata result = (null);
		flickcurl_shapedata_s flickcurl_shapedata_s = new flickcurl_shapedata_s();
		shapes = flickcurl_shapedata_s.flickcurl_build_shapes(fc, xpathCtx, xpathExpr, (null));
		if (shapes) {
			result = shapes[0];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(shapes);
		} 
		return result;
	}
	public int getCreated() {
		return created;
	}
	public void setCreated(int newCreated) {
		created = newCreated;
	}
	public double getAlpha() {
		return alpha;
	}
	public void setAlpha(double newAlpha) {
		alpha = newAlpha;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int newPoints) {
		points = newPoints;
	}
	public int getEdges() {
		return edges;
	}
	public void setEdges(int newEdges) {
		edges = newEdges;
	}
	public Byte getData() {
		return data;
	}
	public void setData(Byte newData) {
		data = newData;
	}
	public Object getData_length() {
		return data_length;
	}
	public void setData_length(Object newData_length) {
		data_length = newData_length;
	}
	public byte[][] getFile_urls() {
		return file_urls;
	}
	public void setFile_urls(byte[][] newFile_urls) {
		file_urls = newFile_urls;
	}
	public int getFile_urls_count() {
		return file_urls_count;
	}
	public void setFile_urls_count(int newFile_urls_count) {
		file_urls_count = newFile_urls_count;
	}
	public int getIs_donuthole() {
		return is_donuthole;
	}
	public void setIs_donuthole(int newIs_donuthole) {
		is_donuthole = newIs_donuthole;
	}
	public int getHas_donuthole() {
		return has_donuthole;
	}
	public void setHas_donuthole(int newHas_donuthole) {
		has_donuthole = newHas_donuthole;
	}
}
/**
 * flickcurl_arg:
 * @name: Argument name
 * @optional: boolean flag (non-0 true) if argument is optional
 * @description: description of argument (HTML)
 *
 * An API method argument.
 */
