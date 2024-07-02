package com.spingPractise.movies.Service;


import com.mongodb.MongoSocketReadTimeoutException;
import com.spingPractise.movies.entity.Movie;
import com.spingPractise.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Retryable(value = { MongoSocketReadTimeoutException.class, SocketTimeoutException.class },
            maxAttempts = 3, backoff = @Backoff(delay = 1000))
    public List<Movie> AllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
