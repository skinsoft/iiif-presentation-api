package de.digitalcollections.iiif.presentation.model.impl;

import de.digitalcollections.iiif.presentation.model.api.Range;
import de.digitalcollections.iiif.presentation.model.api.Metadata;
import de.digitalcollections.iiif.presentation.model.api.Thumbnail;
import java.net.URI;
import java.util.List;

public class RangeImpl extends AbstractIiifResourceImpl implements Range {

  private String description; // optional
  private String label; // required
  private List<Metadata> metadata; // optional
  private String startCanvas; // optional
  private Thumbnail thumbnail; // optional
  private String viewingDirection; // optional
  private String viewingHint; // optional
  private List<String> canvases;
  private List<Range> ranges;

  public RangeImpl(URI id, String label) {
    assert id != null;
    assert label != null;

    this.id = id;
    this.label = label;

    type = "sc:Range";
  }

  public RangeImpl() {
    this.label = null;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String getLabel() {
    return label;
  }

  @Override
  public void setLabel(String label) {
    this.label = label;
  }

  @Override
  public List<Metadata> getMetadata() {
    return metadata;
  }

  @Override
  public void setMetadata(List<Metadata> metadata) {
    this.metadata = metadata;
  }

  @Override
  public String getStartCanvas() {
    return startCanvas;
  }

  @Override
  public void setStartCanvas(String startCanvas) {
    this.startCanvas = startCanvas;
  }

  @Override
  public Thumbnail getThumbnail() {
    return thumbnail;
  }

  @Override
  public void setThumbnail(Thumbnail thumbnail) {
    this.thumbnail = thumbnail;
  }

  @Override
  public String getViewingDirection() {
    return viewingDirection;
  }

  @Override
  public void setViewingDirection(String viewingDirection) {
    this.viewingDirection = viewingDirection;
  }

  @Override
  public String getViewingHint() {
    return viewingHint;
  }

  @Override
  public void setViewingHint(String viewingHint) {
    this.viewingHint = viewingHint;
  }

  @Override
  public List<String> getCanvases() {
    return canvases;
  }

  @Override
  public void setCanvases(List<String> canvases) {
    this.canvases = canvases;
  }

  @Override
  public List<Range> getRanges() {
    return ranges;
  }

  @Override
  public void setRanges(List<Range> ranges) {
    this.ranges = ranges;
  }
}