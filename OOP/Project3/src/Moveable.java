public interface Moveable {
    boolean move(WorldModel world, Entity target, EventScheduler scheduler);
    Point nextPosition(WorldModel world, Point destPos);
}
