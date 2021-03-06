package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.List;


/**
 * Neighbour API client
 */
public interface NeighbourApiService {

    /**
     * Get all my Neighbours
     * @return {@link List}
     */
    List<Neighbour> getNeighbours();

    /**
     * Get all my Favorite Neighbours
     * @return {@link List}
     */

    List<Neighbour> getNeighbourFavorite();

    /**
     * Deletes a neighbour
     * @param neighbour
     */
    void deleteNeighbour(Neighbour neighbour);

    /**
     * Create a neighbour
     * @param neighbour
     */
    void createNeighbour(Neighbour neighbour);

    /**
     * Check if a neighbour exists in the neighboursFavorite List
     */
    boolean doesExistFavorite(Neighbour neighbour);

    /**
     * Add and remove neighbour in the neighboursFavorite List
     */
    void addFavorite(Neighbour neighbour);

    void deleteFavorite(Neighbour neighbour);



}
