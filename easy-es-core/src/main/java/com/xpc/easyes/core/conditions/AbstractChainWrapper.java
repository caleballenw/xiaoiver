package com.xpc.easyes.core.conditions;

import com.xpc.easyes.core.common.OrderByParam;
import com.xpc.easyes.core.conditions.interfaces.*;
import org.elasticsearch.common.geo.GeoPoint;
import org.elasticsearch.common.geo.ShapeRelation;
import org.elasticsearch.common.unit.DistanceUnit;
import org.elasticsearch.geometry.Geometry;
import org.elasticsearch.search.sort.SortBuilder;
import org.elasticsearch.search.sort.SortOrder;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

/**
 * 链式
 * <p>
 * Copyright © 2021 xpc1024 All Rights Reserved
 **/
@SuppressWarnings({"serial", "unchecked"})
public abstract class AbstractChainWrapper<T, R, Children extends AbstractChainWrapper<T, R, Children, Param>, Param>
        extends Wrapper<T> implements Compare<Children, R>, Join<Children>, Func<Children, R>, Nested<Param, Children>,
        Geo<Children, R> {

    protected final Children typedThis = (Children) this;
    /**
     * 子类所包装的具体 Wrapper 类型
     */
    protected Param wrapperChildren;

    /**
     * 必须的构造函数
     */
    public AbstractChainWrapper() {
    }

    public AbstractWrapper getWrapper() {
        return (AbstractWrapper) wrapperChildren;
    }

    @Override
    public Children eq(boolean condition, R column, Object val, Float boost) {
        getWrapper().eq(condition, column, val, boost);
        return typedThis;
    }

    @Override
    public Children ne(boolean condition, R column, Object val, Float boost) {
        getWrapper().ne(condition, column, val, boost);
        return typedThis;
    }

    @Override
    public Children gt(boolean condition, R column, Object val, Float boost) {
        getWrapper().gt(condition, column, val, boost);
        return typedThis;
    }

    @Override
    public Children ge(boolean condition, R column, Object val, Float boost) {
        getWrapper().ge(condition, column, val, boost);
        return typedThis;
    }

    @Override
    public Children lt(boolean condition, R column, Object val, Float boost) {
        getWrapper().lt(condition, column, val, boost);
        return typedThis;
    }

    @Override
    public Children le(boolean condition, R column, Object val, Float boost) {
        getWrapper().le(condition, column, val, boost);
        return typedThis;
    }

    @Override
    public Children between(boolean condition, R column, Object val1, Object val2, Float boost) {
        getWrapper().between(condition, column, val1, val2, boost);
        return typedThis;
    }

    @Override
    public Children notBetween(boolean condition, R column, Object val1, Object val2, Float boost) {
        getWrapper().notBetween(condition, column, val1, val2, boost);
        return typedThis;
    }

    @Override
    public Children match(boolean condition, R column, Object val, Float boost) {
        getWrapper().match(condition, column, val, boost);
        return typedThis;
    }

    @Override
    public Children notMatch(boolean condition, R column, Object val, Float boost) {
        getWrapper().notMatch(condition, column, val, boost);
        return typedThis;
    }

    @Override
    public Children like(boolean condition, R column, Object val, Float boost) {
        getWrapper().like(condition, column, val, boost);
        return typedThis;
    }

    @Override
    public Children notLike(boolean condition, R column, Object val, Float boost) {
        getWrapper().notLike(condition, column, val, boost);
        return typedThis;
    }

    @Override
    public Children likeLeft(boolean condition, R column, Object val, Float boost) {
        getWrapper().likeLeft(condition, column, val, boost);
        return typedThis;
    }

    @Override
    public Children likeRight(boolean condition, R column, Object val, Float boost) {
        getWrapper().likeRight(condition, column, val, boost);
        return typedThis;
    }

    @Override
    public Children isNull(boolean condition, R column, Float boost) {
        getWrapper().isNull(condition, column, boost);
        return typedThis;
    }

    @Override
    public Children isNotNull(boolean condition, R column, Float boost) {
        getWrapper().isNotNull(condition, column, boost);
        return typedThis;
    }

    @Override
    public Children in(boolean condition, R column, Collection<?> coll, Float boost) {
        getWrapper().in(condition, column, coll, boost);
        return typedThis;
    }

    @Override
    public Children highLight(boolean condition, String preTag, String postTag, R column) {
        getWrapper().highLight(condition, preTag, postTag, column);
        return typedThis;
    }

    @Override
    public Children highLight(String preTag, String postTag, R column) {
        getWrapper().highLight(postTag, postTag, column);
        return typedThis;
    }

    @Override
    public Children highLight(boolean condition, String preTag, String postTag, R... columns) {
        getWrapper().highLight(condition, preTag, postTag, columns);
        return typedThis;
    }

    @Override
    public Children orderBy(boolean condition, boolean isAsc, R... columns) {
        getWrapper().orderBy(condition, isAsc, columns);
        return typedThis;
    }

    @Override
    public Children orderBy(boolean condition, List<OrderByParam> orderByParams) {
        getWrapper().orderBy(condition, orderByParams);
        return typedThis;
    }

    @Override
    public Children groupBy(boolean condition, R... columns) {
        getWrapper().groupBy(condition, columns);
        return typedThis;
    }

    @Override
    public Children termsAggregation(boolean condition, String returnName, R column) {
        getWrapper().termsAggregation(condition, returnName, column);
        return typedThis;
    }

    @Override
    public Children avg(boolean condition, String returnName, R column) {
        getWrapper().avg(condition, returnName, column);
        return typedThis;
    }

    @Override
    public Children min(boolean condition, String returnName, R column) {
        getWrapper().min(condition, returnName, column);
        return typedThis;
    }

    @Override
    public Children max(boolean condition, String returnName, R column) {
        getWrapper().max(condition, returnName, column);
        return typedThis;
    }

    @Override
    public Children sum(boolean condition, String returnName, R column) {
        getWrapper().sum(condition, returnName, column);
        return typedThis;
    }

    @Override
    public Children sort(boolean condition, List<SortBuilder<?>> sortBuilders) {
        getWrapper().sort(condition, sortBuilders);
        return typedThis;
    }

    @Override
    public Children distinct(boolean condition, R column) {
        getWrapper().distinct(condition, column);
        return typedThis;
    }

    @Override
    public Children or(boolean condition, Function<Param, Param> func) {
        return null;
    }

    @Override
    public Children notIn(boolean condition, R column, Collection<?> coll, Float boost) {
        getWrapper().notIn(condition, column, coll, boost);
        return typedThis;
    }

    @Override
    public Children and(boolean condition, Function<Param, Param> func) {
        getWrapper().and(condition, func);
        return typedThis;
    }

    @Override
    public Children or(boolean condition) {
        getWrapper().or(condition);
        return typedThis;
    }

    @Override
    public Children match(R column, Object val, Float boost) {
        getWrapper().match(column, val, boost);
        return typedThis;
    }

    @Override
    public Children notMatch(R column, Object val, Float boost) {
        getWrapper().notMatch(column, val, boost);
        return typedThis;
    }

    @Override
    public Children gt(R column, Object val, Float boost) {
        getWrapper().gt(column, val, boost);
        return typedThis;
    }

    @Override
    public Children ge(R column, Object val, Float boost) {
        getWrapper().ge(column, val, boost);
        return typedThis;
    }

    @Override
    public Children lt(R column, Object val, Float boost) {
        getWrapper().lt(column, val, boost);
        return typedThis;
    }

    @Override
    public Children le(R column, Object val, Float boost) {
        getWrapper().le(column, val, boost);
        return typedThis;
    }

    @Override
    public Children between(R column, Object val1, Object val2, Float boost) {
        getWrapper().between(column, val1, val2, boost);
        return typedThis;
    }

    @Override
    public Children notBetween(R column, Object val1, Object val2, Float boost) {
        getWrapper().between(column, val1, val2, boost);
        return typedThis;
    }

    @Override
    public Children like(R column, Object val, Float boost) {
        getWrapper().like(column, val, boost);
        return typedThis;
    }

    @Override
    public Children notLike(R column, Object val, Float boost) {
        getWrapper().notLike(column, val, boost);
        return typedThis;
    }

    @Override
    public Children likeLeft(R column, Object val, Float boost) {
        getWrapper().likeLeft(column, val, boost);
        return typedThis;
    }

    @Override
    public Children likeRight(R column, Object val, Float boost) {
        getWrapper().likeRight(column, val, boost);
        return typedThis;
    }

    @Override
    public Children sort(boolean condition, SortBuilder<?> sortBuilder) {
        getWrapper().sort(condition, sortBuilder);
        return typedThis;
    }

    @Override
    public Children sortByScore(boolean condition, SortOrder sortOrder) {
        getWrapper().sortByScore(condition, sortOrder);
        return typedThis;
    }

    @Override
    public Children geoBoundingBox(boolean condition, R column, GeoPoint topLeft, GeoPoint bottomRight, Float boost) {
        getWrapper().geoBoundingBox(condition, column, topLeft, bottomRight, boost);
        return typedThis;
    }

    @Override
    public Children notInGeoBoundingBox(boolean condition, R column, GeoPoint topLeft, GeoPoint bottomRight, Float boost) {
        getWrapper().notInGeoBoundingBox(condition, column, topLeft, bottomRight, boost);
        return typedThis;
    }

    @Override
    public Children geoDistance(boolean condition, R column, Double distance, DistanceUnit distanceUnit, GeoPoint centralGeoPoint, Float boost) {
        getWrapper().geoDistance(condition, column, distance, distanceUnit, centralGeoPoint, boost);
        return typedThis;
    }

    @Override
    public Children notInGeoDistance(boolean condition, R column, Double distance, DistanceUnit distanceUnit, GeoPoint centralGeoPoint, Float boost) {
        getWrapper().notInGeoDistance(condition, column, distance, distanceUnit, centralGeoPoint, boost);
        return typedThis;
    }

    @Override
    public Children geoDistance(boolean condition, R column, String distance, GeoPoint centralGeoPoint, Float boost) {
        getWrapper().geoDistance(condition, column, distance, centralGeoPoint, boost);
        return typedThis;
    }

    @Override
    public Children notInGeoDistance(boolean condition, R column, String distance, GeoPoint centralGeoPoint, Float boost) {
        getWrapper().notInGeoDistance(condition, column, distance, centralGeoPoint, boost);
        return typedThis;
    }

    @Override
    public Children geoPolygon(boolean condition, R column, List<GeoPoint> geoPoints, Float boost) {
        getWrapper().geoPolygon(condition, column, geoPoints, boost);
        return typedThis;
    }

    @Override
    public Children notInGeoPolygon(boolean condition, R column, Collection<GeoPoint> geoPoints, Float boost) {
        getWrapper().notInGeoPolygon(condition, column, geoPoints, boost);
        return typedThis;
    }

    @Override
    public Children geoShape(boolean condition, R column, String indexedShapeId, Float boost) {
        getWrapper().geoShape(condition, column, indexedShapeId, boost);
        return typedThis;
    }

    @Override
    public Children notInGeoShape(boolean condition, R column, String indexedShapeId, Float boost) {
        getWrapper().notInGeoShape(condition, column, indexedShapeId, boost);
        return typedThis;
    }

    @Override
    public Children geoShape(boolean condition, R column, Geometry geometry, ShapeRelation shapeRelation, Float boost) {
        getWrapper().geoShape(condition, column, geometry, shapeRelation, boost);
        return typedThis;
    }

    @Override
    public Children notInGeoShape(boolean condition, R column, Geometry geometry, ShapeRelation shapeRelation, Float boost) {
        getWrapper().notInGeoShape(condition, column, geometry, shapeRelation, boost);
        return typedThis;
    }
}
