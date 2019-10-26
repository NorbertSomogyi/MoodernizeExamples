package application;

/* Flags for for_each_*_object() below. */
public enum for_each_object_flags {
	FOR_EACH_OBJECT_LOCAL_ONLY, 
	FOR_EACH_OBJECT_PROMISOR_ONLY, 
	FOR_EACH_OBJECT_PACK_ORDER
}
/*
 * Iterate over all accessible packed objects without respect to reachability.
 * By default, this includes both local and alternate packs.
 *
 * Note that some objects may appear twice if they are found in multiple packs.
 * Each pack is visited in an unspecified order. By default, objects within a
 * pack are visited in pack-idx order (i.e., sorted by oid).
 */
/* OBJECT_STORE_H */
