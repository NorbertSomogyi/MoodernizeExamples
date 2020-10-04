package application;

public class Ser_emit_tripleToRaptor_serializer_serialize_statement {
	
	
	private static void ser_emit_triple(Object user_data, Object subject, int subject_type, Object predicate_nspace, Object predicate_name, Object object, int object_type, Object datatype_uri) {
		raptor_serializer serializer = (raptor_serializer)user_data;
		/* static */raptor_statement s = new raptor_statement();
		raptor_uri predicate_ns_uri = new raptor_uri();
		raptor_uri predicate_uri = new raptor_uri();
		s.raptor_statement_init(ModernizedCProgram.rworld);
		if (subject_type == .FLICKCURL_TERM_TYPE_RESOURCE) {
			s.setSubject(ModernizedCProgram.raptor_new_term_from_uri_string(ModernizedCProgram.rworld, (byte)subject));
		} else {
				s.setSubject(ModernizedCProgram.raptor_new_term_from_blank(ModernizedCProgram.rworld, (byte)/* blank node */subject));
		} 
		predicate_ns_uri = ModernizedCProgram.raptor_new_uri(ModernizedCProgram.rworld, (byte)predicate_nspace);
		predicate_uri = ModernizedCProgram.raptor_new_uri_from_uri_local_name(ModernizedCProgram.rworld, predicate_ns_uri, (byte)predicate_name);
		s.setPredicate(ModernizedCProgram.raptor_new_term_from_uri(ModernizedCProgram.rworld, predicate_uri));
		ModernizedCProgram.raptor_free_uri(predicate_uri);
		ModernizedCProgram.raptor_free_uri(predicate_ns_uri);
		if (object_type == .FLICKCURL_TERM_TYPE_RESOURCE) {
			s.setObject(ModernizedCProgram.raptor_new_term_from_uri_string(ModernizedCProgram.rworld, (byte)object));
		}  else if (object_type == .FLICKCURL_TERM_TYPE_BLANK) {
			s.setObject(ModernizedCProgram.raptor_new_term_from_blank(ModernizedCProgram.rworld, (byte)subject));
		} else {
				raptor_uri raptor_datatype_uri = (null);
				if (datatype_uri) {
					raptor_datatype_uri = ModernizedCProgram.raptor_new_uri(ModernizedCProgram.rworld, (byte)datatype_uri);
				} 
				s.setObject(ModernizedCProgram.raptor_new_term_from_literal(ModernizedCProgram.rworld, (byte)object, raptor_datatype_uri, (null)));
				ModernizedCProgram.raptor_free_uri(raptor_datatype_uri);
		} 
		serializer.raptor_serializer_serialize_statement(s);
		s.raptor_statement_clear();
	}
	private static void raptor_statement_init(Object world) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(statement, (byte)'\0', /*Error: sizeof expression not supported yet*/);
		return /*Error: Unsupported expression*/;
	}
	public static void raptor_free_uri(Object u) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(u);
	}
	private static void raptor_serializer_serialize_statement( s) {
		Object generatedFh = this.getFh();
		FILE fh = generatedFh;
		Object generatedSubject = s.getSubject();
		if (generatedSubject.getType() == .RAPTOR_TERM_TYPE_URI) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, "<%s>", (byte)generatedSubject.getValue().getUri());
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, "_:%s", (byte)generatedSubject.getValue().getBlank().getString());
		} 
		Object generatedPredicate = s.getPredicate();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, " <%s> ", (byte)generatedPredicate.getValue().getUri());
		Object generatedObject = s.getObject();
		if (generatedObject.getType() == .RAPTOR_TERM_TYPE_LITERAL) {
			Byte p;
			byte c;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'"', fh);
			for (p = (byte)generatedObject.getValue().getLiteral().getString(); (c = p); p++) {
				if (c == (byte)'\n') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\\\n", fh);
					continue;
				}  else if (c == (byte)'\t') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\\\t", fh);
					continue;
				} 
				if (c == (byte)'\r') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\\\r", fh);
					continue;
				}  else if (c == (byte)'"' || c == (byte)'\\') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\\', fh);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc(c, fh);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'"', fh);
			if (generatedObject.getValue().getLiteral().getDatatype()) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("^^<", fh);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs((byte)generatedObject.getValue().getLiteral().getDatatype(), fh);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'>', fh);
			} 
		}  else if (generatedObject.getType() == .RAPTOR_TERM_TYPE_URI) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, "<%s>", (byte)generatedObject.getValue().getUri());
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, "_:%s", (byte)generatedObject.getValue().getBlank().getString());
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(" . \n", fh);
	}
}
