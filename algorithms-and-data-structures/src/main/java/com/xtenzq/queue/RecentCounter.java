package com.xtenzq.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * RecentCounter class which counts the number of recent requests within a certain time frame.
 */
class RecentCounter {
    Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    /**
     * Adds a new request at time t, where t represents some time in milliseconds,
     * and returns the number of requests that has happened in the past 3000 milliseconds
     * (including the new request). Specifically, return the number of requests that have
     * happened in the inclusive range [t - 3000, t].
     *
     * @param t the time in milliseconds of the new request
     * @return the number of requests in the past 3000 milliseconds
     * @implNote The time complexity of this method is {@code O(n)} in the worst case, where n is the number of requests.
     * The space complexity is {@code O(n)} as well, due to the storage of requests in the queue.
     */
    public int ping(int t) {
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }
        requests.offer(t);
        return requests.size();
    }
}
